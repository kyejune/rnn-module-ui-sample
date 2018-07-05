package com.eegoma.RNAudioPlayer;


import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.image.ReactImageView;
import javax.annotation.Nullable;


public class ReactImageManager extends SimpleViewManager<ReactImageView> {

    /* 해당이름을 index.js에서 모듈 등록할때 사용합니다.*/
    @Override
    public String getName() {
        return "RImageViewSample";
    }

    /* 해당함수를 오버라이딩해서 뷰객체를 리턴해주면 되는듯, 이후 view속성으로 접근가능해보임 */
    @Override
    public ReactImageView createViewInstance(ThemedReactContext context){
        return new ReactImageView(context, Fresco.newDraweeControllerBuilder(), null, null );
    }


    /* 리액트 컴퍼넌트에서 사용할 속성을 정의 및 구현*/
    @ReactProp(name = "src")
    public void setSrc(ReactImageView view, @Nullable ReadableArray sources) {
        view.setSource(sources);
    }
}
// RNTMapManager.m
#import <MapKit/MapKit.h>

#import <React/RCTViewManager.h>
#import <Foundation/Foundation.h>
#import <React/RCTLog.h>

@interface RImageViewSample : RCTViewManager
@end

@implementation RImageViewSample

RCT_EXPORT_MODULE()

- (UIView *)view
{
    return [[MKMapView alloc] init];
}

RCT_CUSTOM_VIEW_PROPERTY( src, NSString, RImageViewSample )
{
    RCTLogInfo(@"----SRC-----" );
}


@end

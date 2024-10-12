package sap.ass01.businessLogic;

import sap.ass01.businessLogic.EBike.EBikeState;

public record EBikeInfo(String bikeID, EBikeState state, P2d loc, V2d direction, double speed, int batteryLevel) {

}
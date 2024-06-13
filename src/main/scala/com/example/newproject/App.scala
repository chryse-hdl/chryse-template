package com.example.newproject

import ee.hrzn.chryse.ChryseApp
import ee.hrzn.chryse.platform.Platform
import ee.hrzn.chryse.platform.cxxrtl.CxxrtlPlatform
import ee.hrzn.chryse.platform.ecp5.Lfe5U_45F
import ee.hrzn.chryse.platform.ecp5.Ulx3SPlatform
import ee.hrzn.chryse.platform.ice40.IceBreakerPlatform

object App extends ChryseApp {
  override val name                                  = "newproject"
  override def genTop()(implicit platform: Platform) = new Top
  override val targetPlatforms =
    Seq(IceBreakerPlatform(), Ulx3SPlatform(Lfe5U_45F))
  override val cxxrtlPlatforms = Seq(new CxxrtlPlatform("cxxrtl") {
    val clockHz = 3_000_000
  })
}

/*
 * generated by Xtext 2.10.0
 */
package org.xtext


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class AsomemodelStandaloneSetup extends AsomemodelStandaloneSetupGenerated {

	def static void doSetup() {
		new AsomemodelStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}

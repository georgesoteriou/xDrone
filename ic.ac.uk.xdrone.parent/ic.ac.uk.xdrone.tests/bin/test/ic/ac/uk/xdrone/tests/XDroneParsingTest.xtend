/*
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.xdrone.tests

import com.google.inject.Inject
import ic.ac.uk.xdrone.xDrone.Program
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(XDroneInjectorProvider)
class XDroneParsingTest {
	@Inject
	ParseHelper<Program> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			fly(){
			    TAKEOFF()
			    MOVE(-2.5, 2, -1.5)
			    MOVE(6, 0, 3)
			    LAND()
			}
			
			environment(){
				
			    TABLE{
			        origin=(3.5,0.5,1.5)
			        size=(1,1,1)
			        color="#ff0000"
			    }
			    
			    SOFA_1{
			        origin=(2, 0.5, 1.5)
			        size=(2,1,1)
			        color="brown"
			    }
			    
			    SOFA_2{
			        origin=(3.5, 0.5, 0)
			        size=(1, 1, 2)
			        color="blue"
			    }
			    
			    PLANT{
			        origin=(-2.5, 1, -1.5)
			        size=(1, 2, 1)
			        color="green"
			    }
			}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
	}
}

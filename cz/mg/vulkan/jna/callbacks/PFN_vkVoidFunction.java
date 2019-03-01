package cz.mg.vulkan.jna.callbacks;

import com.sun.jna.Callback;
import com.sun.jna.CallbackReference;
import com.sun.jna.Pointer;


/**
 *  typedef void (VKAPI_PTR *PFN_vkVoidFunction)(void);
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkVoidFunction.html">khronos documentation</a>
 **/
public interface PFN_vkVoidFunction extends Callback {
    public void callback();

    public static PFN_vkVoidFunction fromPointer(Pointer p){
        return (PFN_vkVoidFunction) CallbackReference.getCallback(PFN_vkVoidFunction.class, p);
    }
}

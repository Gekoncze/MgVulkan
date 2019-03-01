package cz.mg.vulkan.jna.callbacks;

import com.sun.jna.Callback;
import com.sun.jna.CallbackReference;
import com.sun.jna.Pointer;
import cz.mg.vulkan.jna.enums.VkSystemAllocationScope;
import cz.mg.vulkan.jna.types.size_t;


/**
 *  typedef void* (VKAPI_PTR *PFN_vkAllocationFunction)(
 *      void*                                       pUserData,
 *      size_t                                      size,
 *      size_t                                      alignment,
 *      VkSystemAllocationScope                     allocationScope
 *  );
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkAllocationFunction.html">khronos documentation</a>
 **/
public interface PFN_vkAllocationFunction extends Callback {
    public Pointer callback(
            Pointer pUserData,
            size_t size,
            size_t alignment,
            VkSystemAllocationScope.ByValue allocationScope
    );

    public static PFN_vkAllocationFunction fromPointer(Pointer p){
        return (PFN_vkAllocationFunction) CallbackReference.getCallback(PFN_vkAllocationFunction.class, p);
    }
}

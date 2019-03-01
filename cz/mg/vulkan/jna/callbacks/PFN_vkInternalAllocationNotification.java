package cz.mg.vulkan.jna.callbacks;

import com.sun.jna.Callback;
import com.sun.jna.CallbackReference;
import com.sun.jna.Pointer;
import cz.mg.vulkan.jna.enums.VkInternalAllocationType;
import cz.mg.vulkan.jna.enums.VkSystemAllocationScope;
import cz.mg.vulkan.jna.types.size_t;


/**
 *  typedef void (VKAPI_PTR *PFN_vkInternalAllocationNotification)(
 *      void*                                       pUserData,
 *      size_t                                      size,
 *      VkInternalAllocationType                    allocationType,
 *      VkSystemAllocationScope                     allocationScope
 *  );
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkInternalAllocationNotification.html">khronos documentation</a>
 **/
public interface PFN_vkInternalAllocationNotification extends Callback {
    public void callback(
            Pointer pUserData,
            size_t size,
            VkInternalAllocationType allocationType,
            VkSystemAllocationScope allocationScope
    );

    public static PFN_vkInternalAllocationNotification fromPointer(Pointer p){
        return (PFN_vkInternalAllocationNotification) CallbackReference.getCallback(PFN_vkInternalAllocationNotification.class, p);
    }
}

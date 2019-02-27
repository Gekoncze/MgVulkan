package cz.mg.vulkan.jna.callbacks;

import com.sun.jna.Callback;
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
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkReallocationFunction.html">khronos documentation</a>
 **/
public interface PFN_vkReallocationFunction extends Callback {
    public Pointer PFN_vkAllocationFunction(
            Pointer pUserData,
            size_t size,
            size_t alignment,
            VkSystemAllocationScope allocationScope
    );
}

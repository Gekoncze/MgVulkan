package cz.mg.vulkan.jna.structures;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import cz.mg.vulkan.jna.callbacks.*;
import java.util.Arrays;
import java.util.List;


/**
 *  typedef struct VkAllocationCallbacks {
 *      void*                                   pUserData;
 *      PFN_vkAllocationFunction                pfnAllocation;
 *      PFN_vkReallocationFunction              pfnReallocation;
 *      PFN_vkFreeFunction                      pfnFree;
 *      PFN_vkInternalAllocationNotification    pfnInternalAllocation;
 *      PFN_vkInternalFreeNotification          pfnInternalFree;
 *  } VkAllocationCallbacks;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkAllocationCallbacks.html">khronos documentation</a>
 */
public class VkAllocationCallbacks extends Structure {
    public Pointer pUserData;
    public PFN_vkAllocationFunction pfnAllocation;
    public PFN_vkReallocationFunction pfnReallocation;
    public PFN_vkFreeFunction pfnFree;
    public PFN_vkInternalAllocationNotification pfnInternalAllocation;
    public PFN_vkInternalFreeNotification pfnInternalFree;

    public VkAllocationCallbacks() {
    }

    public VkAllocationCallbacks(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "pUserData",
                "pfnAllocation",
                "pfnReallocation",
                "pfnFree",
                "pfnInternalAllocation",
                "pfnInternalFree"
        });
    }

    public static class ByReference extends VkAllocationCallbacks implements Structure.ByReference {}
    public static class ByValue extends VkAllocationCallbacks implements Structure.ByValue {}
}

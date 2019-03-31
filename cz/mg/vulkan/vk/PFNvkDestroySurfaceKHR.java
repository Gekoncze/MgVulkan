package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroySurfaceKHR.html">khronos documentation</a>
 **/
public class PFNvkDestroySurfaceKHR extends VkFunctionPointer {
    public PFNvkDestroySurfaceKHR() {
    }

    public PFNvkDestroySurfaceKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroySurfaceKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkDestroySurfaceKHR(long value) {
        setValue(value);
    }

    public PFNvkDestroySurfaceKHR(VkInstance instance) {
        super(instance, new VkString("vkDestroySurfaceKHR"));
    }

    public void call(VkInstance instance, VkSurfaceKHR surface, VkAllocationCallbacks pAllocator){
        call(getValue(), instance != null ? instance.getVkAddress() : VkInstance.NULL.getVkAddress(), surface != null ? surface.getVkAddress() : VkSurfaceKHR.NULL.getVkAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long instance, long surface, long pAllocator);
}

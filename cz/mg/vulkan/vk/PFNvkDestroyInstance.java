package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyInstance.html">khronos documentation</a>
 **/
public class PFNvkDestroyInstance extends VkFunctionPointer {
    public PFNvkDestroyInstance() {
    }

    public PFNvkDestroyInstance(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroyInstance(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkDestroyInstance(long value) {
        setValue(value);
    }

    public PFNvkDestroyInstance(VkInstance instance) {
        super(instance, new VkString("vkDestroyInstance"));
    }

    public void call(VkInstance instance, VkAllocationCallbacks pAllocator){
        call(getValue(), instance != null ? instance.getVkAddress() : VkInstance.NULL.getVkAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long instance, long pAllocator);
}

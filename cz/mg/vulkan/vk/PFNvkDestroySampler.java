package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroySampler.html">khronos documentation</a>
 **/
public class PFNvkDestroySampler extends VkFunctionPointer {
    public PFNvkDestroySampler() {
    }

    public PFNvkDestroySampler(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroySampler(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkDestroySampler(long value) {
        setValue(value);
    }

    public PFNvkDestroySampler(VkInstance instance) {
        super(instance, new VkString("vkDestroySampler"));
    }

    public void call(VkDevice device, VkSampler sampler, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), sampler != null ? sampler.getVkAddress() : VkSampler.NULL.getVkAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long sampler, long pAllocator);
}

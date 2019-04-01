package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyDescriptorSetLayout.html">khronos documentation</a>
 **/
public class PFNvkDestroyDescriptorSetLayout extends VkFunctionPointer {
    public PFNvkDestroyDescriptorSetLayout() {
    }

    public PFNvkDestroyDescriptorSetLayout(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroyDescriptorSetLayout(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkDestroyDescriptorSetLayout(long value) {
        setValue(value);
    }

    public PFNvkDestroyDescriptorSetLayout(VkInstance instance) {
        super(instance, new VkString("vkDestroyDescriptorSetLayout"));
    }

    public void call(VkDevice device, VkDescriptorSetLayout descriptorSetLayout, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, descriptorSetLayout != null ? descriptorSetLayout.getVkAddress() : VkPointer.NULL_ADDRESS, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long descriptorSetLayout, long pAllocator);
}

package cz.mg.vulkan;

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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getSinkAddress(), descriptorSetLayout != null ? descriptorSetLayout.getVkAddress() : VkPointer.getSinkAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long descriptorSetLayout, long pAllocator);
}

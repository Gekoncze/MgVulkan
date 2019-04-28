package cz.mg.vulkan;

public class PFNvkDestroyDescriptorSetLayout extends VkFunctionPointer {
    public PFNvkDestroyDescriptorSetLayout() {
    }

    protected PFNvkDestroyDescriptorSetLayout(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDestroyDescriptorSetLayout(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDestroyDescriptorSetLayout(long value) {
        setValue(value);
    }

    public PFNvkDestroyDescriptorSetLayout(VkInstance instance) {
        super(instance, new VkString("vkDestroyDescriptorSetLayout"));
    }

    public void call(VkDevice device, VkDescriptorSetLayout descriptorSetLayout, VkAllocationCallbacks pAllocator){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), descriptorSetLayout != null ? descriptorSetLayout.getVkAddress() : VkPointer.getNullAddressNative(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long descriptorSetLayout, long pAllocator);



}

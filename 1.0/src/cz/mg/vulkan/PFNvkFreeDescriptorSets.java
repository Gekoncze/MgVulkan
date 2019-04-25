package cz.mg.vulkan;

public class PFNvkFreeDescriptorSets extends VkFunctionPointer {
    public PFNvkFreeDescriptorSets() {
    }

    protected PFNvkFreeDescriptorSets(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkFreeDescriptorSets(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkFreeDescriptorSets(long value) {
        setValue(value);
    }

    public PFNvkFreeDescriptorSets(VkInstance instance) {
        super(instance, new VkString("vkFreeDescriptorSets"));
    }

    public void call(VkDevice device, VkDescriptorPool descriptorPool, VkUInt32 descriptorSetCount, VkDescriptorSet pDescriptorSets, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), descriptorPool != null ? descriptorPool.getVkAddress() : VkPointer.getNullAddressNative(), descriptorSetCount != null ? descriptorSetCount.getVkAddress() : VkPointer.getNullAddressNative(), pDescriptorSets != null ? pDescriptorSets.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long device, long descriptorPool, long descriptorSetCount, long pDescriptorSets, long rval);
}

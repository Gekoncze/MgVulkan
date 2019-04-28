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

    public int call(VkDevice device, VkDescriptorPool descriptorPool, int descriptorSetCount, VkDescriptorSet pDescriptorSets){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), descriptorPool != null ? descriptorPool.getVkAddress() : VkPointer.getNullAddressNative(), descriptorSetCount, pDescriptorSets != null ? pDescriptorSets.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long descriptorPool, int descriptorSetCount, long pDescriptorSets);

}

package cz.mg.vulkan;

public class PFNvkFreeDescriptorSets extends VkFunctionPointer {
    public PFNvkFreeDescriptorSets() {
    }

    public PFNvkFreeDescriptorSets(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkFreeDescriptorSets(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkFreeDescriptorSets(long value) {
        setValue(value);
    }

    public PFNvkFreeDescriptorSets(VkInstance instance) {
        super(instance, new VkString("vkFreeDescriptorSets"));
    }

    public void call(VkDevice device, VkDescriptorPool descriptorPool, VkUInt32 descriptorSetCount, VkDescriptorSet pDescriptorSets, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), descriptorPool != null ? descriptorPool.getVkAddress() : VkPointer.getNullAddress(), descriptorSetCount != null ? descriptorSetCount.getVkAddress() : VkPointer.getNullAddress(), pDescriptorSets != null ? pDescriptorSets.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long device, long descriptorPool, long descriptorSetCount, long pDescriptorSets, long rval);
}

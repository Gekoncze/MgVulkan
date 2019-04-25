package cz.mg.vulkan;

public class PFNvkUpdateDescriptorSets extends VkFunctionPointer {
    public PFNvkUpdateDescriptorSets() {
    }

    protected PFNvkUpdateDescriptorSets(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkUpdateDescriptorSets(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkUpdateDescriptorSets(long value) {
        setValue(value);
    }

    public PFNvkUpdateDescriptorSets(VkInstance instance) {
        super(instance, new VkString("vkUpdateDescriptorSets"));
    }

    public void call(VkDevice device, VkUInt32 descriptorWriteCount, VkWriteDescriptorSet pDescriptorWrites, VkUInt32 descriptorCopyCount, VkCopyDescriptorSet pDescriptorCopies){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), descriptorWriteCount != null ? descriptorWriteCount.getVkAddress() : VkPointer.getNullAddressNative(), pDescriptorWrites != null ? pDescriptorWrites.getVkAddress() : VkPointer.NULL, descriptorCopyCount != null ? descriptorCopyCount.getVkAddress() : VkPointer.getNullAddressNative(), pDescriptorCopies != null ? pDescriptorCopies.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long device, long descriptorWriteCount, long pDescriptorWrites, long descriptorCopyCount, long pDescriptorCopies);
}

package cz.mg.vulkan;

public class PFNvkUpdateDescriptorSets extends VkFunctionPointer {
    public PFNvkUpdateDescriptorSets() {
    }

    public PFNvkUpdateDescriptorSets(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkUpdateDescriptorSets(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkUpdateDescriptorSets(long value) {
        setValue(value);
    }

    public PFNvkUpdateDescriptorSets(VkInstance instance) {
        super(instance, new VkString("vkUpdateDescriptorSets"));
    }

    public void call(VkDevice device, VkUInt32 descriptorWriteCount, VkWriteDescriptorSet pDescriptorWrites, VkUInt32 descriptorCopyCount, VkCopyDescriptorSet pDescriptorCopies){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getSinkAddress(), descriptorWriteCount != null ? descriptorWriteCount.getVkAddress() : VkPointer.getSinkAddress(), pDescriptorWrites != null ? pDescriptorWrites.getVkAddress() : VkPointer.NULL, descriptorCopyCount != null ? descriptorCopyCount.getVkAddress() : VkPointer.getSinkAddress(), pDescriptorCopies != null ? pDescriptorCopies.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long descriptorWriteCount, long pDescriptorWrites, long descriptorCopyCount, long pDescriptorCopies);
}

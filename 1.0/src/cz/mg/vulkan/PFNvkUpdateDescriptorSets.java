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

    public void call(VkDevice device, int descriptorWriteCount, VkWriteDescriptorSet pDescriptorWrites, int descriptorCopyCount, VkCopyDescriptorSet pDescriptorCopies){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), descriptorWriteCount, pDescriptorWrites != null ? pDescriptorWrites.getVkAddress() : VkPointer.NULL, descriptorCopyCount, pDescriptorCopies != null ? pDescriptorCopies.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, int descriptorWriteCount, long pDescriptorWrites, int descriptorCopyCount, long pDescriptorCopies);

}

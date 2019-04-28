package cz.mg.vulkan;

public class PFNvkGetDeviceMemoryCommitment extends VkFunctionPointer {
    public PFNvkGetDeviceMemoryCommitment() {
    }

    protected PFNvkGetDeviceMemoryCommitment(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetDeviceMemoryCommitment(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetDeviceMemoryCommitment(long value) {
        setValue(value);
    }

    public PFNvkGetDeviceMemoryCommitment(VkInstance instance) {
        super(instance, new VkString("vkGetDeviceMemoryCommitment"));
    }

    public void call(VkDevice device, VkDeviceMemory memory, VkDeviceSize pCommittedMemoryInBytes){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), memory != null ? memory.getVkAddress() : VkPointer.getNullAddressNative(), pCommittedMemoryInBytes != null ? pCommittedMemoryInBytes.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long memory, long pCommittedMemoryInBytes);



}

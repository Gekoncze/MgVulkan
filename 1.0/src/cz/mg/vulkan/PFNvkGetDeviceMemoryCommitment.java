package cz.mg.vulkan;

public class PFNvkGetDeviceMemoryCommitment extends VkFunctionPointer {
    public PFNvkGetDeviceMemoryCommitment() {
    }

    public PFNvkGetDeviceMemoryCommitment(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetDeviceMemoryCommitment(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetDeviceMemoryCommitment(long value) {
        setValue(value);
    }

    public PFNvkGetDeviceMemoryCommitment(VkInstance instance) {
        super(instance, new VkString("vkGetDeviceMemoryCommitment"));
    }

    public void call(VkDevice device, VkDeviceMemory memory, VkDeviceSize pCommittedMemoryInBytes){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), memory != null ? memory.getVkAddress() : VkPointer.getNullAddress(), pCommittedMemoryInBytes != null ? pCommittedMemoryInBytes.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long memory, long pCommittedMemoryInBytes);
}

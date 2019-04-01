package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetDeviceMemoryCommitment.html">khronos documentation</a>
 **/
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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, memory != null ? memory.getVkAddress() : VkPointer.NULL_ADDRESS, pCommittedMemoryInBytes != null ? pCommittedMemoryInBytes.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long memory, long pCommittedMemoryInBytes);
}

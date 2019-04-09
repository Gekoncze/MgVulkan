package cz.mg.vulkan;

public class PFNvkBindBufferMemory extends VkFunctionPointer {
    public PFNvkBindBufferMemory() {
    }

    public PFNvkBindBufferMemory(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkBindBufferMemory(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkBindBufferMemory(long value) {
        setValue(value);
    }

    public PFNvkBindBufferMemory(VkInstance instance) {
        super(instance, new VkString("vkBindBufferMemory"));
    }

    public void call(VkDevice device, VkBuffer buffer, VkDeviceMemory memory, VkDeviceSize memoryOffset, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, buffer != null ? buffer.getVkAddress() : VkPointer.NULL_ADDRESS, memory != null ? memory.getVkAddress() : VkPointer.NULL_ADDRESS, memoryOffset != null ? memoryOffset.getVkAddress() : VkPointer.NULL_ADDRESS, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long buffer, long memory, long memoryOffset, long rval);
}

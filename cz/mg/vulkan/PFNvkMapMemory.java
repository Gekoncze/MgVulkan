package cz.mg.vulkan;

public class PFNvkMapMemory extends VkFunctionPointer {
    public PFNvkMapMemory() {
    }

    public PFNvkMapMemory(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkMapMemory(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkMapMemory(long value) {
        setValue(value);
    }

    public PFNvkMapMemory(VkInstance instance) {
        super(instance, new VkString("vkMapMemory"));
    }

    public void call(VkDevice device, VkDeviceMemory memory, VkDeviceSize offset, VkDeviceSize size, VkMemoryMapFlags flags, VkObject.Pointer ppData, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, memory != null ? memory.getVkAddress() : VkPointer.NULL_ADDRESS, offset != null ? offset.getVkAddress() : VkPointer.NULL_ADDRESS, size != null ? size.getVkAddress() : VkPointer.NULL_ADDRESS, flags != null ? flags.getVkAddress() : VkPointer.NULL_ADDRESS, ppData != null ? ppData.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long memory, long offset, long size, long flags, long ppData, long rval);
}

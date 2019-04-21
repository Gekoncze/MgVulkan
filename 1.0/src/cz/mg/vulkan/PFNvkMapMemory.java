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

    public void call(VkDevice device, VkDeviceMemory memory, VkDeviceSize offset, VkDeviceSize size, VkMemoryMapFlags flags, VkObject ppData, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), memory != null ? memory.getVkAddress() : VkPointer.getNullAddress(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddress(), size != null ? size.getVkAddress() : VkPointer.getNullAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddress(), ppData != null ? ppData.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long device, long memory, long offset, long size, long flags, long ppData, long rval);
}

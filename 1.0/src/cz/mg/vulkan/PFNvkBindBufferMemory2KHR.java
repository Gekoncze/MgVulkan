package cz.mg.vulkan;

public class PFNvkBindBufferMemory2KHR extends VkFunctionPointer {
    public PFNvkBindBufferMemory2KHR() {
    }

    public PFNvkBindBufferMemory2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkBindBufferMemory2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkBindBufferMemory2KHR(long value) {
        setValue(value);
    }

    public PFNvkBindBufferMemory2KHR(VkInstance instance) {
        super(instance, new VkString("vkBindBufferMemory2KHR"));
    }

    public void call(VkDevice device, VkUInt32 bindInfoCount, VkBindBufferMemoryInfoKHR pBindInfos, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), bindInfoCount != null ? bindInfoCount.getVkAddress() : VkPointer.getNullAddress(), pBindInfos != null ? pBindInfos.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long device, long bindInfoCount, long pBindInfos, long rval);
}

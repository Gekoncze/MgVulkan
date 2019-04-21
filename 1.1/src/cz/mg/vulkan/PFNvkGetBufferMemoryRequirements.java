package cz.mg.vulkan;

public class PFNvkGetBufferMemoryRequirements extends VkFunctionPointer {
    public PFNvkGetBufferMemoryRequirements() {
    }

    public PFNvkGetBufferMemoryRequirements(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetBufferMemoryRequirements(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetBufferMemoryRequirements(long value) {
        setValue(value);
    }

    public PFNvkGetBufferMemoryRequirements(VkInstance instance) {
        super(instance, new VkString("vkGetBufferMemoryRequirements"));
    }

    public void call(VkDevice device, VkBuffer buffer, VkMemoryRequirements pMemoryRequirements){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), buffer != null ? buffer.getVkAddress() : VkPointer.getNullAddress(), pMemoryRequirements != null ? pMemoryRequirements.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long buffer, long pMemoryRequirements);
}

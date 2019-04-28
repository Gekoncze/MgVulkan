package cz.mg.vulkan;

public class PFNvkGetBufferMemoryRequirements extends VkFunctionPointer {
    public PFNvkGetBufferMemoryRequirements() {
    }

    protected PFNvkGetBufferMemoryRequirements(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetBufferMemoryRequirements(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetBufferMemoryRequirements(long value) {
        setValue(value);
    }

    public PFNvkGetBufferMemoryRequirements(VkInstance instance) {
        super(instance, new VkString("vkGetBufferMemoryRequirements"));
    }

    public void call(VkDevice device, VkBuffer buffer, VkMemoryRequirements pMemoryRequirements){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), buffer != null ? buffer.getVkAddress() : VkPointer.getNullAddressNative(), pMemoryRequirements != null ? pMemoryRequirements.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long buffer, long pMemoryRequirements);



}

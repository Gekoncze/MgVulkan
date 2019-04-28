package cz.mg.vulkan;

public class PFNvkAllocateCommandBuffers extends VkFunctionPointer {
    public PFNvkAllocateCommandBuffers() {
    }

    protected PFNvkAllocateCommandBuffers(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkAllocateCommandBuffers(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkAllocateCommandBuffers(long value) {
        setValue(value);
    }

    public PFNvkAllocateCommandBuffers(VkInstance instance) {
        super(instance, new VkString("vkAllocateCommandBuffers"));
    }

    public int call(VkDevice device, VkCommandBufferAllocateInfo pAllocateInfo, VkCommandBuffer pCommandBuffers){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pAllocateInfo != null ? pAllocateInfo.getVkAddress() : VkPointer.NULL, pCommandBuffers != null ? pCommandBuffers.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long pAllocateInfo, long pCommandBuffers);

}

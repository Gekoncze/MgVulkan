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

    public void call(VkDevice device, VkCommandBufferAllocateInfo pAllocateInfo, VkCommandBuffer pCommandBuffers, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pAllocateInfo != null ? pAllocateInfo.getVkAddress() : VkPointer.NULL, pCommandBuffers != null ? pCommandBuffers.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long device, long pAllocateInfo, long pCommandBuffers, long rval);
}

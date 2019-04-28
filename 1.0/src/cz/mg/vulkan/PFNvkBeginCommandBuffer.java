package cz.mg.vulkan;

public class PFNvkBeginCommandBuffer extends VkFunctionPointer {
    public PFNvkBeginCommandBuffer() {
    }

    protected PFNvkBeginCommandBuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkBeginCommandBuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkBeginCommandBuffer(long value) {
        setValue(value);
    }

    public PFNvkBeginCommandBuffer(VkInstance instance) {
        super(instance, new VkString("vkBeginCommandBuffer"));
    }

    public void call(VkCommandBuffer commandBuffer, VkCommandBufferBeginInfo pBeginInfo, VkResult rval){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), pBeginInfo != null ? pBeginInfo.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long pBeginInfo, long rval);


    public int call(VkCommandBuffer commandBuffer, VkCommandBufferBeginInfo pBeginInfo){
        return callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), pBeginInfo != null ? pBeginInfo.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long commandBuffer, long pBeginInfo);

}

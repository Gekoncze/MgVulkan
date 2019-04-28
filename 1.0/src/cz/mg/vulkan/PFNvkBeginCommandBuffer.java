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

    public int call(VkCommandBuffer commandBuffer, VkCommandBufferBeginInfo pBeginInfo){
        return callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), pBeginInfo != null ? pBeginInfo.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long commandBuffer, long pBeginInfo);

}

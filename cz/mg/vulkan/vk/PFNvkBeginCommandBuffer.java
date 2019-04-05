package cz.mg.vulkan.vk;

public class PFNvkBeginCommandBuffer extends VkFunctionPointer {
    public PFNvkBeginCommandBuffer() {
    }

    public PFNvkBeginCommandBuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkBeginCommandBuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkBeginCommandBuffer(long value) {
        setValue(value);
    }

    public PFNvkBeginCommandBuffer(VkInstance instance) {
        super(instance, new VkString("vkBeginCommandBuffer"));
    }

    public void call(VkCommandBuffer commandBuffer, VkCommandBufferBeginInfo pBeginInfo, VkResult rval){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, pBeginInfo != null ? pBeginInfo.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long commandBuffer, long pBeginInfo, long rval);
}

package cz.mg.vulkan;

public class PFNvkCmdSetScissor extends VkFunctionPointer {
    public PFNvkCmdSetScissor() {
    }

    protected PFNvkCmdSetScissor(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdSetScissor(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdSetScissor(long value) {
        setValue(value);
    }

    public PFNvkCmdSetScissor(VkInstance instance) {
        super(instance, new VkString("vkCmdSetScissor"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 firstScissor, VkUInt32 scissorCount, VkRect2D pScissors){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), firstScissor != null ? firstScissor.getVkAddress() : VkPointer.getNullAddressNative(), scissorCount != null ? scissorCount.getVkAddress() : VkPointer.getNullAddressNative(), pScissors != null ? pScissors.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long firstScissor, long scissorCount, long pScissors);


    public void call(VkCommandBuffer commandBuffer, int firstScissor, int scissorCount, VkRect2D pScissors){
        callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), firstScissor, scissorCount, pScissors != null ? pScissors.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callSimplifiedNative(long vkaddress, long commandBuffer, int firstScissor, int scissorCount, long pScissors);

}

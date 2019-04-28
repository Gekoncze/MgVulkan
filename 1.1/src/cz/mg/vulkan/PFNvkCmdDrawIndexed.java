package cz.mg.vulkan;

public class PFNvkCmdDrawIndexed extends VkFunctionPointer {
    public PFNvkCmdDrawIndexed() {
    }

    protected PFNvkCmdDrawIndexed(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdDrawIndexed(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdDrawIndexed(long value) {
        setValue(value);
    }

    public PFNvkCmdDrawIndexed(VkInstance instance) {
        super(instance, new VkString("vkCmdDrawIndexed"));
    }

    public void call(VkCommandBuffer commandBuffer, int indexCount, int instanceCount, int firstIndex, int vertexOffset, int firstInstance){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), indexCount, instanceCount, firstIndex, vertexOffset, firstInstance);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, int indexCount, int instanceCount, int firstIndex, int vertexOffset, int firstInstance);

}

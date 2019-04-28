package cz.mg.vulkan;

public class PFNvkResetCommandBuffer extends VkFunctionPointer {
    public PFNvkResetCommandBuffer() {
    }

    protected PFNvkResetCommandBuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkResetCommandBuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkResetCommandBuffer(long value) {
        setValue(value);
    }

    public PFNvkResetCommandBuffer(VkInstance instance) {
        super(instance, new VkString("vkResetCommandBuffer"));
    }

    public int call(VkCommandBuffer commandBuffer, int flags){
        return callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), flags);
    }

    protected static native int callNative(long vkaddress, long commandBuffer, int flags);

}

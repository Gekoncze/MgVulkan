package cz.mg.vulkan;

public class PFNvkCmdSetDepthBias extends VkFunctionPointer {
    public PFNvkCmdSetDepthBias() {
    }

    protected PFNvkCmdSetDepthBias(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdSetDepthBias(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdSetDepthBias(long value) {
        setValue(value);
    }

    public PFNvkCmdSetDepthBias(VkInstance instance) {
        super(instance, new VkString("vkCmdSetDepthBias"));
    }

    public void call(VkCommandBuffer commandBuffer, VkFloat depthBiasConstantFactor, VkFloat depthBiasClamp, VkFloat depthBiasSlopeFactor){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), depthBiasConstantFactor != null ? depthBiasConstantFactor.getVkAddress() : VkPointer.getNullAddressNative(), depthBiasClamp != null ? depthBiasClamp.getVkAddress() : VkPointer.getNullAddressNative(), depthBiasSlopeFactor != null ? depthBiasSlopeFactor.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long depthBiasConstantFactor, long depthBiasClamp, long depthBiasSlopeFactor);


    public void call(VkCommandBuffer commandBuffer, float depthBiasConstantFactor, float depthBiasClamp, float depthBiasSlopeFactor){
        callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), depthBiasConstantFactor, depthBiasClamp, depthBiasSlopeFactor);
    }

    protected static native void callSimplifiedNative(long vkaddress, long commandBuffer, float depthBiasConstantFactor, float depthBiasClamp, float depthBiasSlopeFactor);

}

package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdEndRenderPass.html">khronos documentation</a>
 **/
public class PFNvkCmdEndRenderPass extends VkFunctionPointer {
    public PFNvkCmdEndRenderPass() {
    }

    public PFNvkCmdEndRenderPass(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdEndRenderPass(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdEndRenderPass(long value) {
        setValue(value);
    }

    public PFNvkCmdEndRenderPass(VkInstance instance) {
        super(instance, new VkString("vkCmdEndRenderPass"));
    }

    public void call(VkCommandBuffer commandBuffer){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkCommandBuffer.NULL.getVkAddress());
    }

    private static native void call(long vkaddress, long commandBuffer);
}

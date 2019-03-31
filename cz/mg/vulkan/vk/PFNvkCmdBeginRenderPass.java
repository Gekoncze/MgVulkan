package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdBeginRenderPass.html">khronos documentation</a>
 **/
public class PFNvkCmdBeginRenderPass extends VkFunctionPointer {
    public PFNvkCmdBeginRenderPass() {
    }

    public PFNvkCmdBeginRenderPass(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdBeginRenderPass(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdBeginRenderPass(long value) {
        setValue(value);
    }

    public PFNvkCmdBeginRenderPass(VkInstance instance) {
        super(instance, new VkString("vkCmdBeginRenderPass"));
    }

    public void call(VkCommandBuffer commandBuffer, VkRenderPassBeginInfo pRenderPassBegin, VkSubpassContents contents){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkCommandBuffer.NULL.getVkAddress(), pRenderPassBegin != null ? pRenderPassBegin.getVkAddress() : VkPointer.NULL, contents != null ? contents.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long pRenderPassBegin, long contents);
}

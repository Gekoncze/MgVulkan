package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkRenderPassBeginInfo.html">khronos documentation</a>
 **/
public class VulkanRenderPassBeginInfo extends VulkanObject {
    public VulkanRenderPassBeginInfo(){
        super(new VkRenderPassBeginInfo());
    }

    public VulkanRenderPassBeginInfo(VkRenderPassBeginInfo vk){
        super(vk);
    }

    @Override
    public VkRenderPassBeginInfo getVk(){
        return (VkRenderPassBeginInfo) super.getVk();
    }
    public VulkanRenderPassBeginInfo(VulkanObject pNext, VulkanRenderPass renderPass, VulkanFramebuffer framebuffer, VulkanRect2D renderArea, VulkanUInt32 clearValueCount, VulkanClearValue pClearValues) {
        super(new VkRenderPassBeginInfo(pNext.getVk(), renderPass.getVk(), framebuffer.getVk(), renderArea.getVk(), clearValueCount.getVk(), pClearValues.getVk()));
    }

    public VulkanStructureType getSType() {
        return new VulkanStructureType(getVk().getSType());
    }

    public void setSType(VulkanStructureType sType) {
        getVk().setSType(sType.getVk());
    }

    public VulkanObject getPNext() {
        return new VulkanObject(getVk().getPNext());
    }

    public void setPNext(VulkanObject pNext) {
        getVk().setPNext(pNext.getVk());
    }

    public VulkanRenderPass getRenderPass() {
        return new VulkanRenderPass(getVk().getRenderPass());
    }

    public void setRenderPass(VulkanRenderPass renderPass) {
        getVk().setRenderPass(renderPass.getVk());
    }

    public VulkanFramebuffer getFramebuffer() {
        return new VulkanFramebuffer(getVk().getFramebuffer());
    }

    public void setFramebuffer(VulkanFramebuffer framebuffer) {
        getVk().setFramebuffer(framebuffer.getVk());
    }

    public VulkanRect2D getRenderArea() {
        return new VulkanRect2D(getVk().getRenderArea());
    }

    public void setRenderArea(VulkanRect2D renderArea) {
        getVk().setRenderArea(renderArea.getVk());
    }

    public VulkanUInt32 getClearValueCount() {
        return new VulkanUInt32(getVk().getClearValueCount());
    }

    public void setClearValueCount(VulkanUInt32 clearValueCount) {
        getVk().setClearValueCount(clearValueCount.getVk());
    }

    public VulkanClearValue getPClearValues() {
        return new VulkanClearValue(getVk().getPClearValues());
    }

    public void setPClearValues(VulkanClearValue pClearValues) {
        getVk().setPClearValues(pClearValues.getVk());
    }


    public static class Array extends VulkanRenderPassBeginInfo implements cz.mg.collections.array.ReadonlyArray<VulkanRenderPassBeginInfo> {
        public Array(VkRenderPassBeginInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkRenderPassBeginInfo.Array(count));
        }

        public Array(int count, VulkanRenderPassBeginInfo o){
            this(new VkRenderPassBeginInfo.Array(count, o.getVk()));
        }

        @Override
        public VkRenderPassBeginInfo.Array getVk(){
            return (VkRenderPassBeginInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanRenderPassBeginInfo get(int i){
            return new VulkanRenderPassBeginInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkRenderPassBeginInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkRenderPassBeginInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkRenderPassBeginInfo.Pointer(value));
        }

        @Override
        public VkRenderPassBeginInfo.Pointer getVk(){
            return (VkRenderPassBeginInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanRenderPassBeginInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanRenderPassBeginInfo.Pointer> {
            public Array(int count) {
                super(new VkRenderPassBeginInfo.Pointer.Array(count));
            }

            public Array(VulkanRenderPassBeginInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkRenderPassBeginInfo.Pointer.Array getVk(){
                return (VkRenderPassBeginInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanRenderPassBeginInfo.Pointer get(int i){
                return new VulkanRenderPassBeginInfo.Pointer(getVk().get(i));
            }
        }
    }
}

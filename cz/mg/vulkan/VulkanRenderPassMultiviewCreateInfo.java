package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkRenderPassMultiviewCreateInfo.html">khronos documentation</a>
 **/
public class VulkanRenderPassMultiviewCreateInfo extends VulkanObject {
    public VulkanRenderPassMultiviewCreateInfo(){
        super(new VkRenderPassMultiviewCreateInfo());
    }

    public VulkanRenderPassMultiviewCreateInfo(VkRenderPassMultiviewCreateInfo vk){
        super(vk);
    }

    @Override
    public VkRenderPassMultiviewCreateInfo getVk(){
        return (VkRenderPassMultiviewCreateInfo) super.getVk();
    }
    public VulkanRenderPassMultiviewCreateInfo(VulkanObject pNext, VulkanUInt32 subpassCount, VulkanUInt32 pViewMasks, VulkanUInt32 dependencyCount, VulkanInt32 pViewOffsets, VulkanUInt32 correlationMaskCount, VulkanUInt32 pCorrelationMasks) {
        super(new VkRenderPassMultiviewCreateInfo(pNext.getVk(), subpassCount.getVk(), pViewMasks.getVk(), dependencyCount.getVk(), pViewOffsets.getVk(), correlationMaskCount.getVk(), pCorrelationMasks.getVk()));
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

    public VulkanUInt32 getSubpassCount() {
        return new VulkanUInt32(getVk().getSubpassCount());
    }

    public void setSubpassCount(VulkanUInt32 subpassCount) {
        getVk().setSubpassCount(subpassCount.getVk());
    }

    public VulkanUInt32 getPViewMasks() {
        return new VulkanUInt32(getVk().getPViewMasks());
    }

    public void setPViewMasks(VulkanUInt32 pViewMasks) {
        getVk().setPViewMasks(pViewMasks.getVk());
    }

    public VulkanUInt32 getDependencyCount() {
        return new VulkanUInt32(getVk().getDependencyCount());
    }

    public void setDependencyCount(VulkanUInt32 dependencyCount) {
        getVk().setDependencyCount(dependencyCount.getVk());
    }

    public VulkanInt32 getPViewOffsets() {
        return new VulkanInt32(getVk().getPViewOffsets());
    }

    public void setPViewOffsets(VulkanInt32 pViewOffsets) {
        getVk().setPViewOffsets(pViewOffsets.getVk());
    }

    public VulkanUInt32 getCorrelationMaskCount() {
        return new VulkanUInt32(getVk().getCorrelationMaskCount());
    }

    public void setCorrelationMaskCount(VulkanUInt32 correlationMaskCount) {
        getVk().setCorrelationMaskCount(correlationMaskCount.getVk());
    }

    public VulkanUInt32 getPCorrelationMasks() {
        return new VulkanUInt32(getVk().getPCorrelationMasks());
    }

    public void setPCorrelationMasks(VulkanUInt32 pCorrelationMasks) {
        getVk().setPCorrelationMasks(pCorrelationMasks.getVk());
    }


    public static class Array extends VulkanRenderPassMultiviewCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanRenderPassMultiviewCreateInfo> {
        public Array(VkRenderPassMultiviewCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkRenderPassMultiviewCreateInfo.Array(count));
        }

        public Array(int count, VulkanRenderPassMultiviewCreateInfo o){
            this(new VkRenderPassMultiviewCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkRenderPassMultiviewCreateInfo.Array getVk(){
            return (VkRenderPassMultiviewCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanRenderPassMultiviewCreateInfo get(int i){
            return new VulkanRenderPassMultiviewCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkRenderPassMultiviewCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkRenderPassMultiviewCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkRenderPassMultiviewCreateInfo.Pointer(value));
        }

        @Override
        public VkRenderPassMultiviewCreateInfo.Pointer getVk(){
            return (VkRenderPassMultiviewCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanRenderPassMultiviewCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanRenderPassMultiviewCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkRenderPassMultiviewCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanRenderPassMultiviewCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkRenderPassMultiviewCreateInfo.Pointer.Array getVk(){
                return (VkRenderPassMultiviewCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanRenderPassMultiviewCreateInfo.Pointer get(int i){
                return new VulkanRenderPassMultiviewCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}

package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceGeneratedCommandsLimitsNVX.html">khronos documentation</a>
 **/
public class VulkanDeviceGeneratedCommandsLimitsNVX extends VulkanObject {
    public VulkanDeviceGeneratedCommandsLimitsNVX(){
        super(new VkDeviceGeneratedCommandsLimitsNVX());
    }

    public VulkanDeviceGeneratedCommandsLimitsNVX(VkDeviceGeneratedCommandsLimitsNVX vk){
        super(vk);
    }

    @Override
    public VkDeviceGeneratedCommandsLimitsNVX getVk(){
        return (VkDeviceGeneratedCommandsLimitsNVX) super.getVk();
    }

    public VulkanDeviceGeneratedCommandsLimitsNVX(VulkanStructureType sType, VulkanObject pNext, VulkanUInt32 maxIndirectCommandsLayoutTokenCount, VulkanUInt32 maxObjectEntryCounts, VulkanUInt32 minSequenceCountBufferOffsetAlignment, VulkanUInt32 minSequenceIndexBufferOffsetAlignment, VulkanUInt32 minCommandsTokenBufferOffsetAlignment) {
        super(new VkDeviceGeneratedCommandsLimitsNVX(sType.getVk(), pNext.getVk(), maxIndirectCommandsLayoutTokenCount.getVk(), maxObjectEntryCounts.getVk(), minSequenceCountBufferOffsetAlignment.getVk(), minSequenceIndexBufferOffsetAlignment.getVk(), minCommandsTokenBufferOffsetAlignment.getVk()));
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

    public VulkanUInt32 getMaxIndirectCommandsLayoutTokenCount() {
        return new VulkanUInt32(getVk().getMaxIndirectCommandsLayoutTokenCount());
    }

    public void setMaxIndirectCommandsLayoutTokenCount(VulkanUInt32 maxIndirectCommandsLayoutTokenCount) {
        getVk().setMaxIndirectCommandsLayoutTokenCount(maxIndirectCommandsLayoutTokenCount.getVk());
    }

    public VulkanUInt32 getMaxObjectEntryCounts() {
        return new VulkanUInt32(getVk().getMaxObjectEntryCounts());
    }

    public void setMaxObjectEntryCounts(VulkanUInt32 maxObjectEntryCounts) {
        getVk().setMaxObjectEntryCounts(maxObjectEntryCounts.getVk());
    }

    public VulkanUInt32 getMinSequenceCountBufferOffsetAlignment() {
        return new VulkanUInt32(getVk().getMinSequenceCountBufferOffsetAlignment());
    }

    public void setMinSequenceCountBufferOffsetAlignment(VulkanUInt32 minSequenceCountBufferOffsetAlignment) {
        getVk().setMinSequenceCountBufferOffsetAlignment(minSequenceCountBufferOffsetAlignment.getVk());
    }

    public VulkanUInt32 getMinSequenceIndexBufferOffsetAlignment() {
        return new VulkanUInt32(getVk().getMinSequenceIndexBufferOffsetAlignment());
    }

    public void setMinSequenceIndexBufferOffsetAlignment(VulkanUInt32 minSequenceIndexBufferOffsetAlignment) {
        getVk().setMinSequenceIndexBufferOffsetAlignment(minSequenceIndexBufferOffsetAlignment.getVk());
    }

    public VulkanUInt32 getMinCommandsTokenBufferOffsetAlignment() {
        return new VulkanUInt32(getVk().getMinCommandsTokenBufferOffsetAlignment());
    }

    public void setMinCommandsTokenBufferOffsetAlignment(VulkanUInt32 minCommandsTokenBufferOffsetAlignment) {
        getVk().setMinCommandsTokenBufferOffsetAlignment(minCommandsTokenBufferOffsetAlignment.getVk());
    }


    public static class Array extends VulkanDeviceGeneratedCommandsLimitsNVX implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceGeneratedCommandsLimitsNVX> {
        public Array(VkDeviceGeneratedCommandsLimitsNVX.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDeviceGeneratedCommandsLimitsNVX.Array(count));
        }

        public Array(int count, VulkanDeviceGeneratedCommandsLimitsNVX o){
            this(new VkDeviceGeneratedCommandsLimitsNVX.Array(count, o.getVk()));
        }

        @Override
        public VkDeviceGeneratedCommandsLimitsNVX.Array getVk(){
            return (VkDeviceGeneratedCommandsLimitsNVX.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDeviceGeneratedCommandsLimitsNVX get(int i){
            return new VulkanDeviceGeneratedCommandsLimitsNVX(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDeviceGeneratedCommandsLimitsNVX.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDeviceGeneratedCommandsLimitsNVX.Pointer());
        }

        public Pointer(long value) {
            this(new VkDeviceGeneratedCommandsLimitsNVX.Pointer(value));
        }

        @Override
        public VkDeviceGeneratedCommandsLimitsNVX.Pointer getVk(){
            return (VkDeviceGeneratedCommandsLimitsNVX.Pointer) super.getVk();
        }

        public static class Array extends VulkanDeviceGeneratedCommandsLimitsNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceGeneratedCommandsLimitsNVX.Pointer> {
            public Array(int count) {
                super(new VkDeviceGeneratedCommandsLimitsNVX.Pointer.Array(count));
            }

            public Array(VulkanDeviceGeneratedCommandsLimitsNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDeviceGeneratedCommandsLimitsNVX.Pointer.Array getVk(){
                return (VkDeviceGeneratedCommandsLimitsNVX.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDeviceGeneratedCommandsLimitsNVX.Pointer get(int i){
                return new VulkanDeviceGeneratedCommandsLimitsNVX.Pointer(getVk().get(i));
            }
        }
    }
}

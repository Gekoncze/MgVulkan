package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPipelineDiscardRectangleStateCreateInfoEXT extends VulkanObject {
    public VulkanPipelineDiscardRectangleStateCreateInfoEXT(){
        super(new VkPipelineDiscardRectangleStateCreateInfoEXT());
    }

    public VulkanPipelineDiscardRectangleStateCreateInfoEXT(VkPipelineDiscardRectangleStateCreateInfoEXT vk){
        super(vk);
    }

    @Override
    public VkPipelineDiscardRectangleStateCreateInfoEXT getVk(){
        return (VkPipelineDiscardRectangleStateCreateInfoEXT) super.getVk();
    }
    public VulkanPipelineDiscardRectangleStateCreateInfoEXT(VulkanObject pNext, VulkanPipelineDiscardRectangleStateCreateFlagsEXT flags, VulkanDiscardRectangleModeEXT discardRectangleMode, VulkanUInt32 discardRectangleCount, VulkanRect2D pDiscardRectangles) {
        super(new VkPipelineDiscardRectangleStateCreateInfoEXT(pNext.getVk(), flags.getVk(), discardRectangleMode.getVk(), discardRectangleCount.getVk(), pDiscardRectangles.getVk()));
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

    public VulkanPipelineDiscardRectangleStateCreateFlagsEXT getFlags() {
        return new VulkanPipelineDiscardRectangleStateCreateFlagsEXT(getVk().getFlags());
    }

    public void setFlags(VulkanPipelineDiscardRectangleStateCreateFlagsEXT flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanDiscardRectangleModeEXT getDiscardRectangleMode() {
        return new VulkanDiscardRectangleModeEXT(getVk().getDiscardRectangleMode());
    }

    public void setDiscardRectangleMode(VulkanDiscardRectangleModeEXT discardRectangleMode) {
        getVk().setDiscardRectangleMode(discardRectangleMode.getVk());
    }

    public VulkanUInt32 getDiscardRectangleCount() {
        return new VulkanUInt32(getVk().getDiscardRectangleCount());
    }

    public void setDiscardRectangleCount(VulkanUInt32 discardRectangleCount) {
        getVk().setDiscardRectangleCount(discardRectangleCount.getVk());
    }

    public VulkanRect2D getPDiscardRectangles() {
        return new VulkanRect2D(getVk().getPDiscardRectangles());
    }

    public void setPDiscardRectangles(VulkanRect2D pDiscardRectangles) {
        getVk().setPDiscardRectangles(pDiscardRectangles.getVk());
    }


    public static class Array extends VulkanPipelineDiscardRectangleStateCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineDiscardRectangleStateCreateInfoEXT> {
        public Array(VkPipelineDiscardRectangleStateCreateInfoEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineDiscardRectangleStateCreateInfoEXT.Array(count));
        }

        public Array(int count, VulkanPipelineDiscardRectangleStateCreateInfoEXT o){
            this(new VkPipelineDiscardRectangleStateCreateInfoEXT.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineDiscardRectangleStateCreateInfoEXT.Array getVk(){
            return (VkPipelineDiscardRectangleStateCreateInfoEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineDiscardRectangleStateCreateInfoEXT get(int i){
            return new VulkanPipelineDiscardRectangleStateCreateInfoEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineDiscardRectangleStateCreateInfoEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineDiscardRectangleStateCreateInfoEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineDiscardRectangleStateCreateInfoEXT.Pointer(value));
        }

        @Override
        public VkPipelineDiscardRectangleStateCreateInfoEXT.Pointer getVk(){
            return (VkPipelineDiscardRectangleStateCreateInfoEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineDiscardRectangleStateCreateInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineDiscardRectangleStateCreateInfoEXT.Pointer> {
            public Array(int count) {
                super(new VkPipelineDiscardRectangleStateCreateInfoEXT.Pointer.Array(count));
            }

            public Array(VulkanPipelineDiscardRectangleStateCreateInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineDiscardRectangleStateCreateInfoEXT.Pointer.Array getVk(){
                return (VkPipelineDiscardRectangleStateCreateInfoEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineDiscardRectangleStateCreateInfoEXT.Pointer get(int i){
                return new VulkanPipelineDiscardRectangleStateCreateInfoEXT.Pointer(getVk().get(i));
            }
        }
    }
}

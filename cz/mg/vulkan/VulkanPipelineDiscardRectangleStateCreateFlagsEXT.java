package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineDiscardRectangleStateCreateFlagsEXT.html">khronos documentation</a>
 **/
public class VulkanPipelineDiscardRectangleStateCreateFlagsEXT extends VulkanFlags {
    public VulkanPipelineDiscardRectangleStateCreateFlagsEXT(){
        super(new VkPipelineDiscardRectangleStateCreateFlagsEXT());
    }

    public VulkanPipelineDiscardRectangleStateCreateFlagsEXT(VkPipelineDiscardRectangleStateCreateFlagsEXT vk){
        super(vk);
    }

    @Override
    public VkPipelineDiscardRectangleStateCreateFlagsEXT getVk(){
        return (VkPipelineDiscardRectangleStateCreateFlagsEXT) super.getVk();
    }

    public VulkanPipelineDiscardRectangleStateCreateFlagsEXT(int value){
        super(new VkPipelineDiscardRectangleStateCreateFlagsEXT(value));
    }

    public static class Array extends VulkanPipelineDiscardRectangleStateCreateFlagsEXT implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineDiscardRectangleStateCreateFlagsEXT> {
        public Array(VkPipelineDiscardRectangleStateCreateFlagsEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineDiscardRectangleStateCreateFlagsEXT.Array(count));
        }

        public Array(int count, VulkanPipelineDiscardRectangleStateCreateFlagsEXT o){
            this(new VkPipelineDiscardRectangleStateCreateFlagsEXT.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineDiscardRectangleStateCreateFlagsEXT.Array getVk(){
            return (VkPipelineDiscardRectangleStateCreateFlagsEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineDiscardRectangleStateCreateFlagsEXT get(int i){
            return new VulkanPipelineDiscardRectangleStateCreateFlagsEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineDiscardRectangleStateCreateFlagsEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineDiscardRectangleStateCreateFlagsEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineDiscardRectangleStateCreateFlagsEXT.Pointer(value));
        }

        @Override
        public VkPipelineDiscardRectangleStateCreateFlagsEXT.Pointer getVk(){
            return (VkPipelineDiscardRectangleStateCreateFlagsEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineDiscardRectangleStateCreateFlagsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineDiscardRectangleStateCreateFlagsEXT.Pointer> {
            public Array(int count) {
                super(new VkPipelineDiscardRectangleStateCreateFlagsEXT.Pointer.Array(count));
            }

            public Array(VulkanPipelineDiscardRectangleStateCreateFlagsEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineDiscardRectangleStateCreateFlagsEXT.Pointer.Array getVk(){
                return (VkPipelineDiscardRectangleStateCreateFlagsEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineDiscardRectangleStateCreateFlagsEXT.Pointer get(int i){
                return new VulkanPipelineDiscardRectangleStateCreateFlagsEXT.Pointer(getVk().get(i));
            }
        }
    }
}

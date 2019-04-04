package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineViewportSwizzleStateCreateFlagsNV.html">khronos documentation</a>
 **/
public class VulkanPipelineViewportSwizzleStateCreateFlagsNV extends VulkanFlags {
    public VulkanPipelineViewportSwizzleStateCreateFlagsNV(){
        super(new VkPipelineViewportSwizzleStateCreateFlagsNV());
    }

    public VulkanPipelineViewportSwizzleStateCreateFlagsNV(VkPipelineViewportSwizzleStateCreateFlagsNV vk){
        super(vk);
    }

    @Override
    public VkPipelineViewportSwizzleStateCreateFlagsNV getVk(){
        return (VkPipelineViewportSwizzleStateCreateFlagsNV) super.getVk();
    }

    public VulkanPipelineViewportSwizzleStateCreateFlagsNV(int value){
        super(new VkPipelineViewportSwizzleStateCreateFlagsNV(value));
    }

    public static class Array extends VulkanPipelineViewportSwizzleStateCreateFlagsNV implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineViewportSwizzleStateCreateFlagsNV> {
        public Array(VkPipelineViewportSwizzleStateCreateFlagsNV.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineViewportSwizzleStateCreateFlagsNV.Array(count));
        }

        public Array(int count, VulkanPipelineViewportSwizzleStateCreateFlagsNV o){
            this(new VkPipelineViewportSwizzleStateCreateFlagsNV.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineViewportSwizzleStateCreateFlagsNV.Array getVk(){
            return (VkPipelineViewportSwizzleStateCreateFlagsNV.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineViewportSwizzleStateCreateFlagsNV get(int i){
            return new VulkanPipelineViewportSwizzleStateCreateFlagsNV(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineViewportSwizzleStateCreateFlagsNV.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineViewportSwizzleStateCreateFlagsNV.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineViewportSwizzleStateCreateFlagsNV.Pointer(value));
        }

        @Override
        public VkPipelineViewportSwizzleStateCreateFlagsNV.Pointer getVk(){
            return (VkPipelineViewportSwizzleStateCreateFlagsNV.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineViewportSwizzleStateCreateFlagsNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineViewportSwizzleStateCreateFlagsNV.Pointer> {
            public Array(int count) {
                super(new VkPipelineViewportSwizzleStateCreateFlagsNV.Pointer.Array(count));
            }

            public Array(VulkanPipelineViewportSwizzleStateCreateFlagsNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineViewportSwizzleStateCreateFlagsNV.Pointer.Array getVk(){
                return (VkPipelineViewportSwizzleStateCreateFlagsNV.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineViewportSwizzleStateCreateFlagsNV.Pointer get(int i){
                return new VulkanPipelineViewportSwizzleStateCreateFlagsNV.Pointer(getVk().get(i));
            }
        }
    }
}

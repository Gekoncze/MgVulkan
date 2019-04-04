package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineCoverageModulationStateCreateFlagsNV.html">khronos documentation</a>
 **/
public class VulkanPipelineCoverageModulationStateCreateFlagsNV extends VulkanFlags {
    public VulkanPipelineCoverageModulationStateCreateFlagsNV(){
        super(new VkPipelineCoverageModulationStateCreateFlagsNV());
    }

    public VulkanPipelineCoverageModulationStateCreateFlagsNV(VkPipelineCoverageModulationStateCreateFlagsNV vk){
        super(vk);
    }

    @Override
    public VkPipelineCoverageModulationStateCreateFlagsNV getVk(){
        return (VkPipelineCoverageModulationStateCreateFlagsNV) super.getVk();
    }

    public VulkanPipelineCoverageModulationStateCreateFlagsNV(int value){
        super(new VkPipelineCoverageModulationStateCreateFlagsNV(value));
    }

    public static class Array extends VulkanPipelineCoverageModulationStateCreateFlagsNV implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineCoverageModulationStateCreateFlagsNV> {
        public Array(VkPipelineCoverageModulationStateCreateFlagsNV.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineCoverageModulationStateCreateFlagsNV.Array(count));
        }

        public Array(int count, VulkanPipelineCoverageModulationStateCreateFlagsNV o){
            this(new VkPipelineCoverageModulationStateCreateFlagsNV.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineCoverageModulationStateCreateFlagsNV.Array getVk(){
            return (VkPipelineCoverageModulationStateCreateFlagsNV.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineCoverageModulationStateCreateFlagsNV get(int i){
            return new VulkanPipelineCoverageModulationStateCreateFlagsNV(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineCoverageModulationStateCreateFlagsNV.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineCoverageModulationStateCreateFlagsNV.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineCoverageModulationStateCreateFlagsNV.Pointer(value));
        }

        @Override
        public VkPipelineCoverageModulationStateCreateFlagsNV.Pointer getVk(){
            return (VkPipelineCoverageModulationStateCreateFlagsNV.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineCoverageModulationStateCreateFlagsNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineCoverageModulationStateCreateFlagsNV.Pointer> {
            public Array(int count) {
                super(new VkPipelineCoverageModulationStateCreateFlagsNV.Pointer.Array(count));
            }

            public Array(VulkanPipelineCoverageModulationStateCreateFlagsNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineCoverageModulationStateCreateFlagsNV.Pointer.Array getVk(){
                return (VkPipelineCoverageModulationStateCreateFlagsNV.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineCoverageModulationStateCreateFlagsNV.Pointer get(int i){
                return new VulkanPipelineCoverageModulationStateCreateFlagsNV.Pointer(getVk().get(i));
            }
        }
    }
}

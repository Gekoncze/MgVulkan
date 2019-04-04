package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCoverageModulationModeNV.html">khronos documentation</a>
 **/
public class VulkanCoverageModulationModeNV extends VulkanEnum {
    public static final int COVERAGE_MODULATION_MODE_NONE_NV = VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_NONE_NV;
    public static final int COVERAGE_MODULATION_MODE_RGB_NV = VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_RGB_NV;
    public static final int COVERAGE_MODULATION_MODE_ALPHA_NV = VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_ALPHA_NV;
    public static final int COVERAGE_MODULATION_MODE_RGBA_NV = VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_RGBA_NV;

    public VulkanCoverageModulationModeNV(){
        super(new VkCoverageModulationModeNV());
    }

    public VulkanCoverageModulationModeNV(VkCoverageModulationModeNV vk){
        super(vk);
    }

    @Override
    public VkCoverageModulationModeNV getVk(){
        return (VkCoverageModulationModeNV) super.getVk();
    }

    public VulkanCoverageModulationModeNV(int value){
        super(new VkCoverageModulationModeNV(value));
    }

    @Override
    public String toString() {
        if(getValue() == COVERAGE_MODULATION_MODE_NONE_NV) return "COVERAGE_MODULATION_MODE_NONE_NV";
        if(getValue() == COVERAGE_MODULATION_MODE_RGB_NV) return "COVERAGE_MODULATION_MODE_RGB_NV";
        if(getValue() == COVERAGE_MODULATION_MODE_ALPHA_NV) return "COVERAGE_MODULATION_MODE_ALPHA_NV";
        if(getValue() == COVERAGE_MODULATION_MODE_RGBA_NV) return "COVERAGE_MODULATION_MODE_RGBA_NV";
        return "UNKNOWN";
    }

    public static class Array extends VulkanCoverageModulationModeNV implements cz.mg.collections.array.ReadonlyArray<VulkanCoverageModulationModeNV> {
        public Array(VkCoverageModulationModeNV.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkCoverageModulationModeNV.Array(count));
        }

        public Array(int count, VulkanCoverageModulationModeNV o){
            this(new VkCoverageModulationModeNV.Array(count, o.getVk()));
        }

        @Override
        public VkCoverageModulationModeNV.Array getVk(){
            return (VkCoverageModulationModeNV.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanCoverageModulationModeNV get(int i){
            return new VulkanCoverageModulationModeNV(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkCoverageModulationModeNV.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkCoverageModulationModeNV.Pointer());
        }

        public Pointer(long value) {
            this(new VkCoverageModulationModeNV.Pointer(value));
        }

        @Override
        public VkCoverageModulationModeNV.Pointer getVk(){
            return (VkCoverageModulationModeNV.Pointer) super.getVk();
        }

        public static class Array extends VulkanCoverageModulationModeNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanCoverageModulationModeNV.Pointer> {
            public Array(int count) {
                super(new VkCoverageModulationModeNV.Pointer.Array(count));
            }

            public Array(VulkanCoverageModulationModeNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkCoverageModulationModeNV.Pointer.Array getVk(){
                return (VkCoverageModulationModeNV.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanCoverageModulationModeNV.Pointer get(int i){
                return new VulkanCoverageModulationModeNV.Pointer(getVk().get(i));
            }
        }
    }
}

package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkShaderInfoTypeAMD.html">khronos documentation</a>
 **/
public class VulkanShaderInfoTypeAMD extends VulkanEnum {
    public static final int SHADER_INFO_TYPE_STATISTICS_AMD = VkShaderInfoTypeAMD.VK_SHADER_INFO_TYPE_STATISTICS_AMD;
    public static final int SHADER_INFO_TYPE_BINARY_AMD = VkShaderInfoTypeAMD.VK_SHADER_INFO_TYPE_BINARY_AMD;
    public static final int SHADER_INFO_TYPE_DISASSEMBLY_AMD = VkShaderInfoTypeAMD.VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD;

    public VulkanShaderInfoTypeAMD(){
        super(new VkShaderInfoTypeAMD());
    }

    public VulkanShaderInfoTypeAMD(VkShaderInfoTypeAMD vk){
        super(vk);
    }

    @Override
    public VkShaderInfoTypeAMD getVk(){
        return (VkShaderInfoTypeAMD) super.getVk();
    }

    public VulkanShaderInfoTypeAMD(int value){
        super(new VkShaderInfoTypeAMD(value));
    }

    @Override
    public String toString() {
        if(getValue() == SHADER_INFO_TYPE_STATISTICS_AMD) return "SHADER_INFO_TYPE_STATISTICS_AMD";
        if(getValue() == SHADER_INFO_TYPE_BINARY_AMD) return "SHADER_INFO_TYPE_BINARY_AMD";
        if(getValue() == SHADER_INFO_TYPE_DISASSEMBLY_AMD) return "SHADER_INFO_TYPE_DISASSEMBLY_AMD";
        return "UNKNOWN";
    }

    public static class Array extends VulkanShaderInfoTypeAMD implements cz.mg.collections.array.ReadonlyArray<VulkanShaderInfoTypeAMD> {
        public Array(VkShaderInfoTypeAMD.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkShaderInfoTypeAMD.Array(count));
        }

        public Array(int count, VulkanShaderInfoTypeAMD o){
            this(new VkShaderInfoTypeAMD.Array(count, o.getVk()));
        }

        @Override
        public VkShaderInfoTypeAMD.Array getVk(){
            return (VkShaderInfoTypeAMD.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanShaderInfoTypeAMD get(int i){
            return new VulkanShaderInfoTypeAMD(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkShaderInfoTypeAMD.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkShaderInfoTypeAMD.Pointer());
        }

        public Pointer(long value) {
            this(new VkShaderInfoTypeAMD.Pointer(value));
        }

        @Override
        public VkShaderInfoTypeAMD.Pointer getVk(){
            return (VkShaderInfoTypeAMD.Pointer) super.getVk();
        }

        public static class Array extends VulkanShaderInfoTypeAMD.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanShaderInfoTypeAMD.Pointer> {
            public Array(int count) {
                super(new VkShaderInfoTypeAMD.Pointer.Array(count));
            }

            public Array(VulkanShaderInfoTypeAMD[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkShaderInfoTypeAMD.Pointer.Array getVk(){
                return (VkShaderInfoTypeAMD.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanShaderInfoTypeAMD.Pointer get(int i){
                return new VulkanShaderInfoTypeAMD.Pointer(getVk().get(i));
            }
        }
    }
}

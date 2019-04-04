package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkRasterizationOrderAMD.html">khronos documentation</a>
 **/
public class VulkanRasterizationOrderAMD extends VulkanEnum {
    public static final int RASTERIZATION_ORDER_STRICT_AMD = VkRasterizationOrderAMD.VK_RASTERIZATION_ORDER_STRICT_AMD;
    public static final int RASTERIZATION_ORDER_RELAXED_AMD = VkRasterizationOrderAMD.VK_RASTERIZATION_ORDER_RELAXED_AMD;

    public VulkanRasterizationOrderAMD(){
        super(new VkRasterizationOrderAMD());
    }

    public VulkanRasterizationOrderAMD(VkRasterizationOrderAMD vk){
        super(vk);
    }

    @Override
    public VkRasterizationOrderAMD getVk(){
        return (VkRasterizationOrderAMD) super.getVk();
    }

    public VulkanRasterizationOrderAMD(int value){
        super(new VkRasterizationOrderAMD(value));
    }

    @Override
    public String toString() {
        if(getValue() == RASTERIZATION_ORDER_STRICT_AMD) return "RASTERIZATION_ORDER_STRICT_AMD";
        if(getValue() == RASTERIZATION_ORDER_RELAXED_AMD) return "RASTERIZATION_ORDER_RELAXED_AMD";
        return "UNKNOWN";
    }

    public static class Array extends VulkanRasterizationOrderAMD implements cz.mg.collections.array.ReadonlyArray<VulkanRasterizationOrderAMD> {
        public Array(VkRasterizationOrderAMD.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkRasterizationOrderAMD.Array(count));
        }

        public Array(int count, VulkanRasterizationOrderAMD o){
            this(new VkRasterizationOrderAMD.Array(count, o.getVk()));
        }

        @Override
        public VkRasterizationOrderAMD.Array getVk(){
            return (VkRasterizationOrderAMD.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanRasterizationOrderAMD get(int i){
            return new VulkanRasterizationOrderAMD(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkRasterizationOrderAMD.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkRasterizationOrderAMD.Pointer());
        }

        public Pointer(long value) {
            this(new VkRasterizationOrderAMD.Pointer(value));
        }

        @Override
        public VkRasterizationOrderAMD.Pointer getVk(){
            return (VkRasterizationOrderAMD.Pointer) super.getVk();
        }

        public static class Array extends VulkanRasterizationOrderAMD.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanRasterizationOrderAMD.Pointer> {
            public Array(int count) {
                super(new VkRasterizationOrderAMD.Pointer.Array(count));
            }

            public Array(VulkanRasterizationOrderAMD[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkRasterizationOrderAMD.Pointer.Array getVk(){
                return (VkRasterizationOrderAMD.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanRasterizationOrderAMD.Pointer get(int i){
                return new VulkanRasterizationOrderAMD.Pointer(getVk().get(i));
            }
        }
    }
}

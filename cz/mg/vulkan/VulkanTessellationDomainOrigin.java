package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkTessellationDomainOrigin.html">khronos documentation</a>
 **/
public class VulkanTessellationDomainOrigin extends VulkanEnum {
    public static final int UPPER_LEFT = VkTessellationDomainOrigin.VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT;
    public static final int LOWER_LEFT = VkTessellationDomainOrigin.VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT;
    public static final int UPPER_LEFT_KHR = VkTessellationDomainOrigin.VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT_KHR;
    public static final int LOWER_LEFT_KHR = VkTessellationDomainOrigin.VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT_KHR;

    public VulkanTessellationDomainOrigin(){
        super(new VkTessellationDomainOrigin());
    }

    public VulkanTessellationDomainOrigin(VkTessellationDomainOrigin vk){
        super(vk);
    }

    @Override
    public VkTessellationDomainOrigin getVk(){
        return (VkTessellationDomainOrigin) super.getVk();
    }

    public VulkanTessellationDomainOrigin(int value){
        super(new VkTessellationDomainOrigin(value));
    }

    @Override
    public String toString() {
        if(getValue() == UPPER_LEFT) return "UPPER_LEFT";
        if(getValue() == LOWER_LEFT) return "LOWER_LEFT";
        if(getValue() == UPPER_LEFT_KHR) return "UPPER_LEFT_KHR";
        if(getValue() == LOWER_LEFT_KHR) return "LOWER_LEFT_KHR";
        return "UNKNOWN";
    }

    public static class Array extends VulkanTessellationDomainOrigin implements cz.mg.collections.array.ReadonlyArray<VulkanTessellationDomainOrigin> {
        public Array(VkTessellationDomainOrigin.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkTessellationDomainOrigin.Array(count));
        }

        public Array(int count, VulkanTessellationDomainOrigin o){
            this(new VkTessellationDomainOrigin.Array(count, o.getVk()));
        }

        @Override
        public VkTessellationDomainOrigin.Array getVk(){
            return (VkTessellationDomainOrigin.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanTessellationDomainOrigin get(int i){
            return new VulkanTessellationDomainOrigin(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkTessellationDomainOrigin.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkTessellationDomainOrigin.Pointer());
        }

        public Pointer(long value) {
            this(new VkTessellationDomainOrigin.Pointer(value));
        }

        @Override
        public VkTessellationDomainOrigin.Pointer getVk(){
            return (VkTessellationDomainOrigin.Pointer) super.getVk();
        }

        public static class Array extends VulkanTessellationDomainOrigin.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanTessellationDomainOrigin.Pointer> {
            public Array(int count) {
                super(new VkTessellationDomainOrigin.Pointer.Array(count));
            }

            public Array(VulkanTessellationDomainOrigin[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkTessellationDomainOrigin.Pointer.Array getVk(){
                return (VkTessellationDomainOrigin.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanTessellationDomainOrigin.Pointer get(int i){
                return new VulkanTessellationDomainOrigin.Pointer(getVk().get(i));
            }
        }
    }
}

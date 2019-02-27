package cz.mg.vulkan.jna.callbacks;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;


/**
 *  typedef void (VKAPI_PTR *PFN_vkFreeFunction)(
 *      void* pUserData,
 *      void* pMemory
 *  );
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkFreeFunction.html">khronos documentation</a>
 */
public interface PFN_vkFreeFunction extends Callback {
    public void PFN_vkFreeFunction(Pointer pUserData, Pointer pMemory);
}

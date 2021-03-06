package de.gishmo.example.devk.client.ui.login.content;

import com.github.nalukit.nalu.client.component.AbstractComponentController;
import com.github.nalukit.nalu.client.component.annotation.Controller;
import de.gishmo.example.devk.client.ApplicationContext;
import de.gishmo.example.devk.client.Routes;
import elemental2.dom.HTMLElement;

/**
 * Copyright (C) 2018 - 2019 Frank Hossfeld <frank.hossfeld@googlemail.com>
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
@Controller(route = "/loginShell/login",
            selector = "content",
            componentInterface = ILoginComponent.class,
            component = LoginComponent.class)
public class LoginController
    extends AbstractComponentController<ApplicationContext, ILoginComponent, HTMLElement>
    implements ILoginComponent.Controller {

  public LoginController() {
  }

  @Override
  public void doLogin(String userId,
                      String password) {
    // we are always happy with the credential ...
    this.context.setLoggedIn(true);
    this.router.route(Routes.ROUTE_SEARCH);
  }

}
